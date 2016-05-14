using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace LojaNinja.MVC.Models
{
    public enum TipoPagamento
    {
        Amex = 1,
        Diners = 2,
        Visa = 3,
        Mastercard = 4
    }

    public class PedidoModel
    {
        public int? Id { get; set; }
        [Required]
        [DisplayName("Nome Cliente: ")]
        [StringLength(160, ErrorMessage = "Digite um Nome")]
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

        [Required]
        [DisplayName("Cartão de Credito: ")]
        [EnumDataType(typeof(TipoPagamento), ErrorMessage ="Selecione uma opção")]
        public TipoPagamento TipoPagamento { get; set; }

        [Required]
        public string Cidade { get; set; }

        [Required]
        [StringLength(2, ErrorMessage ="Estado com nome muito grande")]
        public string Estado { get; set; }
    }
}