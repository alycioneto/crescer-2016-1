using LojaNinja.Dominio;
using LojaNinja.MVC.Filters;
using LojaNinja.MVC.Models;
using LojaNinja.MVC.Services;
using LojaNinja.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Routing;

namespace LojaNinja.MVC.Controllers
{
        public class UsuarioController : Controller
        {
            private UsuarioServico _usuarioServico;

        public UsuarioController()
        {
            _usuarioServico = new UsuarioServico(new UsuarioRepositorioADO());
        }

        [HttpGet]
        public ActionResult Login()
        {
            if (!ServicoDeSessao.EstaLogado)
            {
                return View();
            }

            return RedirectToAction("AreaSecreta");
         }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Entrar(LoginViewModel loginViewModel)
        {
             if (ModelState.IsValid)
             {
                 Usuario usuarioEncontrado = _usuarioServico.BuscarUsuarioPorAutenticacao(
                                              loginViewModel.Email, loginViewModel.Senha
                                            );

                if (usuarioEncontrado != null)
                {
                    var usuarioLogadoModel = new UsuarioLogadoModel(usuarioEncontrado);
                    ServicoDeSessao.CriarSessao(usuarioLogadoModel);
                    return RedirectToAction("Logado");
                }
                else
                {
                    ModelState.AddModelError("INVALID_USER", "Usuário ou senha inválido.");
                }
            }
            return View("Login", loginViewModel);
        }

        [HttpGet]
        [CWIToken]
        public ActionResult Logado()
        {
           UsuarioLogadoModel usuarioLogado = ServicoDeSessao.UsuarioLogado;
           ViewBag.NomeUsuarioLogado = usuarioLogado.Nome;
            return RedirectToAction("Index", "Main");
        }
        public ActionResult CadastroUsuario()
        {
            return View();
        }
        public ActionResult CadastroEfetuado(UsuarioModel usuario)
        {
            UsuarioRepositorioADO cadastrar = new UsuarioRepositorioADO();
            cadastrar.CadastroUsuario(usuario.Nome, usuario.Senha, usuario.Email);
            return View(usuario);
        }
        [HttpGet]   
        [CWIToken(Roles = "Admin")]
        public ActionResult UsuariosCadastrados()
        {
            return View();
        }
    }
}