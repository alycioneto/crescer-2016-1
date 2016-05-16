using MVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVC.Controllers
{
    public class StreetFighterController : Controller
    {        
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult FichaTecnica()
        {
            return View();
        }
        public ActionResult SobreMim()
        {
            SobreMim alycio = new SobreMim()
            {
                Nome = "Alycio",
                Idade = 22,
                Cidade = "Porto Alegre"
            };
            return View(alycio);
        }
    }

}