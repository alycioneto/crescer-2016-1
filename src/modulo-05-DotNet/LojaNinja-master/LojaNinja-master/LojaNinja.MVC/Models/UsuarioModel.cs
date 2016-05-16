using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LojaNinja.MVC.Models
{
    public class UsuarioModel
    {
        public string Email { get; private set; }
        public string Nome { get; private set; }
        public string Senha { get; set; }
    }
}