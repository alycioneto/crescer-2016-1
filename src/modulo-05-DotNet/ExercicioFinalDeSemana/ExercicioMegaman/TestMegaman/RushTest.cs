using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class RushTest
    {
        [TestMethod]
        public void CriarRushComoUmRoboEVerificarAtaque()
        {
            Robo rush = new Rush();
            Bot bot = new Bot();
            rush.Atacar(bot);
            Assert.AreEqual(96 , bot.Vida);  
        }
        [TestMethod]
        public void CriarRushComoUmRoboEVerificarDefesa()
        {
            Robo rush = new Rush();
            Bot bot = new Bot();
            bot.Atacar(rush);
            Assert.AreEqual(98, rush.Vida);
        }
        [TestMethod]
        public void t()
        {
            Robo rush = new Rush();
            Bot bot = new Bot();
            bot.Atacar(rush);
            Assert.AreEqual(98, rush.Vida);
        }
    }
}
