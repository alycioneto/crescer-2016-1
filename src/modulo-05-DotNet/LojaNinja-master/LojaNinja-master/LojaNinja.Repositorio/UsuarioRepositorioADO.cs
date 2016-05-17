using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;
namespace LojaNinja.Repositorio
{
    public class UsuarioRepositorioADO : IUsuarioRepositorio
    {
        public Usuario BuscarUsuarioPorAutenticacao(string email, string senha)
        {
            string connectionString = ConfigurationManager.ConnectionStrings["conexao"].ConnectionString;
            using (var conexao = new SqlConnection(connectionString))
            {
                string sql = "SELECT TOP 1 * FROM Usuarios WHERE email = @p_email AND senha = @p_senha";

                var comando = new SqlCommand(sql, conexao);
                comando.Parameters.Add(new SqlParameter("p_email", email));
                comando.Parameters.Add(new SqlParameter("p_senha", senha));

                conexao.Open();

                SqlDataReader leitor = comando.ExecuteReader();

                Usuario usuarioEncontrado = null;

                if (leitor.Read())
                {
                    usuarioEncontrado = new Usuario();
                    usuarioEncontrado.Email = leitor["email"].ToString();
                    usuarioEncontrado.Nome = leitor["nome"].ToString();
                }

                return usuarioEncontrado;
            }
        }
        public void CadastroUsuario(string nome, string senha, string email)
        {
            string connectionString = ConfigurationManager.ConnectionStrings["conexao"].ConnectionString;
            using (TransactionScope scope = new TransactionScope())
            {
                int linhasAfetadas = 0;

                using (var conexao = new SqlConnection(connectionString))
                {
                    try
                    {
                        string sql = "INSERT INTO Usuarios (nome, email, senha) VALUES (@p_nome, @p_email, @p_senha)";

                        var comando = new SqlCommand(sql, conexao);
                        comando.Parameters.Add(new SqlParameter("p_email", email));
                        comando.Parameters.Add(new SqlParameter("p_senha", senha));
                        comando.Parameters.Add(new SqlParameter("p_nome", nome));

                        conexao.Open();

                        linhasAfetadas = comando.ExecuteNonQuery();

                        if (linhasAfetadas != 1)
                        {
                            throw new Exception("O update ferrou...");
                        }

                        scope.Complete();
                    }
                    catch (Exception)
                    {

                        throw;
                    }
                }
            }
        }
    }
}
