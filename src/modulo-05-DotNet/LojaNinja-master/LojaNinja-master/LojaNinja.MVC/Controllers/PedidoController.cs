using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using LojaNinja.MVC.Models;
using LojaNinja.Repositorio;
using LojaNinja.Dominio;

namespace LojaNinja.MVC.Controllers
{
    public class PedidoController : Controller
    {
        private RepositorioVendas repositorio = new RepositorioVendas();
        public ActionResult Buscar()
        {
            return View();
        }

        public ActionResult Registro(int? id)
        {
            if (id.HasValue)
            {
                var pedido = repositorio.ObterPedidoPorId(id.Value);

                var pedidoEncontrado = new PedidoModel() {
                    Id = pedido.Id,
                    NomeCliente = pedido.NomeCliente,
                    NomeProduto = pedido.NomeProduto,
                    ValorVenda = pedido.Valor,
                    DataEntrega = pedido.DataEntregaDesejada,
                    TipoPagamento = (Models.TipoPagamento)pedido.TipoPagamento,
                    Cidade = pedido.Cidade,
                    Estado = pedido.Estado                    
                    
                };
                return View("Registro", pedidoEncontrado);
            }
            else
            {
                return View("Registro");
            }
        }

        public ActionResult Salvar(PedidoModel pedido)
        {
            if(ModelState.IsValid)
            {
                try
                {
                    var novoPedido = new Pedido(pedido.DataEntrega, pedido.NomeProduto, pedido.ValorVenda,(Dominio.TipoPagamento) pedido.TipoPagamento, pedido.NomeCliente, pedido.Cidade, pedido.Estado);
                    //if (model.Id.HasValue)
                    //    repositorio.AtualizarPedido(pedido);
                    //else
                    repositorio.IncluirPedido(novoPedido);
                    return View("CadastroEfetuado", pedido);
                }
                catch (ArgumentException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
            }
                return View("Registro", pedido);        
        }
    }
}