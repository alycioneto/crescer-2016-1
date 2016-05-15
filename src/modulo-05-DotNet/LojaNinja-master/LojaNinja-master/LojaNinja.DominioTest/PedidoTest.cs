using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using LojaNinja.Dominio;

namespace LojaNinja.DominioTest
{
    [TestClass]
    public class PedidoTest
    {
        [TestMethod]
        [ExpectedException(typeof (ArgumentException), "A data de entrega desejada deve ser no mínimo 1 dia maior do que a data atual.")]
        public void ErroPoisNaoExistePossibilidadeDeEntrega()
        {
            var pedido = new Pedido(DateTime.Now, "faca", 10, TipoPagamento.Mastercard,"Alycio", "Porto Alegre", "RS");    
        }
        [TestMethod]
        public void OPedidoRecebidoEUrgente()
        {
            var pedido = new Pedido(DateTime.Now.AddDays(6), "Kunai", 20, TipoPagamento.Amex, "Eu", "Porto Alegre", "RS");
            Assert.IsTrue(pedido.PedidoUrgente);
        }
        [TestMethod]
        public void OPedidoRecebidoNaoUrgente()
        {
            var pedido = new Pedido(DateTime.Now.AddDays(8), "Kunai", 20, TipoPagamento.Amex, "Eu", "Porto Alegre", "RS");
            Assert.IsFalse(pedido.PedidoUrgente);
        }
    }
}
