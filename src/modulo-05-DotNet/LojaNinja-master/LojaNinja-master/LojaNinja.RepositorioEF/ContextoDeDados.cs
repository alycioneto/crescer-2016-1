using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LojaNinja.Dominio;

namespace LojaNinja.RepositorioEF
{
    class ContextoDeDados : DbContext
    {
        public ContextoDeDados() : base("ConexaoLojaNinja")
        {
        }
        public DbSet<Usuario> Usuario { get; set; }
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
            base.OnModelCreating(modelBuilder);
        }
    }
}
