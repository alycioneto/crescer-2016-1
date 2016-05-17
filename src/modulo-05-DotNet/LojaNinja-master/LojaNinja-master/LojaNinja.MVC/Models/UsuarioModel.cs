using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace LojaNinja.MVC.Models
{
    public class UsuarioModel
    {
        [Required]
        [DisplayName("Nome")]
        [StringLength(50)]
        public string Nome { get; set; }

        [Required]
        [DisplayName("Senha")]
        [DataType(DataType.Password)]
        [StringLength(20)]
        public string Senha { get; set; }

        [Required]
        [DisplayName("Confirma Senha")]
        [DataType(DataType.Password)]
        [Compare("Senha", ErrorMessage = "Senhas Devem ser iguais")]
        public string ConfirmaSenha { get; set; }

        [Required]
        [DisplayName("E-mail")]
        [StringLength(30)]
        [EmailAddress]
        public string Email { get; set; }
    }
}