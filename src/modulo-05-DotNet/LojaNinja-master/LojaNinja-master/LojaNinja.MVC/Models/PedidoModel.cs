using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace LojaNinja.MVC.Models
{
 

    public class PedidoModel
    {
        public int? Id { get; set; }
        [Required]
        [DisplayName("Nome: ")]
        [StringLength(160, ErrorMessage = "Nome invalido, no maximo 160 caracteres")]
        public string NomeCliente { get; set; }

        [Required]
        [DisplayName("Nome Produto: ")]
        [StringLength(160, ErrorMessage = "Digite o Nome do Produto")]
        public string NomeProduto { get; set; }

        [Required]
        [DisplayName("Valor do Produto: ")]
        [Range(0.00, double.MaxValue, ErrorMessage ="Valor deve ser Positivo")]
        public decimal ValorVenda { get; set; }

        [Required]
        [DataType(DataType.Date)]
        [DisplayName("Data de entrega: ")]
        public DateTime DataEntrega { get; set; }
        [DataType(DataType.Date)]
        [DisplayName("Data do pedido: ")]
        public DateTime DataPedido { get; set; }
        [Required]
        [DisplayName("Cartão de Credito: ")]
        [EnumDataType(typeof(TipoPagamento), ErrorMessage ="Selecione uma opção")]
        public TipoPagamento TipoPagamento { get; set; }

        [Required]
        public string Cidade { get; set; }

        [Required]
        [StringLength(2, ErrorMessage ="Estado com nome muito grande")]
        public string Estado { get; set; }

        [Display(Name = "Produto Urgente")]
        public bool Urgente { get; set; }
        public PedidoModel(Pedido pedido)
        {
            this.Id = pedido.Id;
            this.DataPedido = pedido.DataPedido;
            this.DataEntrega = pedido.DataEntregaDesejada;
            this.NomeProduto = pedido.NomeProduto;
            this.ValorVenda = pedido.Valor;
            this.TipoPagamento =pedido.TipoPagamento;
            this.NomeCliente = pedido.NomeCliente;
            this.Cidade = pedido.Cidade;
            this.Estado = pedido.Estado;
            this.Urgente = pedido.PedidoUrgente;
        }

        public PedidoModel() { }
    }
}