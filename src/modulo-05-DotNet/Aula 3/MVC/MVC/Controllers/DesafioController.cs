using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVC.Controllers
{
    public class DesafioController : Controller
    {
        public ActionResult Index(string aluno)
       {
            ViewBag.css = aluno;
            return View();
        }
    }
}