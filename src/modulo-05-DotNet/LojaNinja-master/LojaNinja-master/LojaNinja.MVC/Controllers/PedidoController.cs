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

                var pedidoEncontrado = new PedidoModel(pedido);
                return View("Registro", pedidoEncontrado);
            }
            else
            {
                return View("Registro");
            }
        }

        public ActionResult Salvar(PedidoModel pedido)
        {
            PedidoModel model;
            if(ModelState.IsValid)
            {
                try
                {

                    if (pedido.Id.HasValue)
                    {
                        var atualizarPedido = new Pedido((int)pedido.Id, pedido.DataPedido, pedido.DataEntrega, pedido.NomeProduto, pedido.ValorVenda, pedido.TipoPagamento, pedido.NomeCliente, pedido.Cidade, pedido.Estado, pedido.Urgente);
                        repositorio.AtualizarPedido(atualizarPedido);
                        model = new PedidoModel(atualizarPedido);
                    }
                    else
                    {
                        var novoPedido = new Pedido(pedido.DataEntrega, pedido.NomeProduto, pedido.ValorVenda, pedido.TipoPagamento, pedido.NomeCliente, pedido.Cidade, pedido.Estado);
                        repositorio.IncluirPedido(novoPedido);
                        pedido.Id = novoPedido.Id;
                    }
                    return View("CadastroEfetuado", pedido);
                }
                catch (ArgumentException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
            }
                return View("Registro", pedido);        
        }
        public ActionResult Detalhes(int id)
        {
            var pedido = new PedidoModel(repositorio.ObterPedidoPorId(id));   
            return View(pedido);
        }
        public ActionResult Listagem() {
            var listaDeProdutos = repositorio.ObterPedidos();
            return View(listaDeProdutos);
        }
        public ActionResult Excluir(int id)
        {
            var pedidoExcluido = repositorio.ObterPedidoPorId(id);
            repositorio.ExcluirPedido(id);
            return View(pedidoExcluido);
        }

    }
}