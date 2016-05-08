using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class ProtomanTest
    {
        [TestMethod]
        public void ProtomanMorreEDaRespawn()
        {
            Protoman protoman = new Protoman();
            Bot bot = new Bot();
            for (int i = 0; i < 34; i++)
            {
                bot.Atacar(protoman);
            }
            Assert.AreEqual(20, protoman.Vida);
        }
        [TestMethod]
        public void ProtomanMorreDaRespawnEAumentaAtaque()
        {
            Protoman protoman = new Protoman();
            Bot bot = new Bot();
            for (int i = 0; i < 34; i++)
            {
                bot.Atacar(protoman);
            }
            protoman.Atacar(bot);
            Assert.AreEqual(93, bot.Vida);
        }
        [TestMethod]
        public void ProtomanMorreDaRespawnMorreNovamenteENaoDaRespawn()
        {
            Protoman protoman = new Protoman();
            Bot bot = new Bot();
            for (int i = 0; i < 41; i++)
            {
                bot.Atacar(protoman);
            }
            Assert.AreEqual(-1, protoman.Vida);
        }
        [TestMethod]
        public void ToStringProtoman()
        {
            Protoman protoman = new Protoman();
            String Recebido = protoman.ToString();
            String Esperado = "Nome: Protoman, Vida: 100, Ataque: 5, Defesa: 2";
            Assert.AreEqual(Esperado, Recebido);
        }
        [TestMethod]
        public void ProtomanComUmUpgradeDefesa()
        {
            Protoman protoman = new Protoman();
            Bot botAtacado = new Bot();
            UpgradeDefesa upgrade = new UpgradeDefesa();
            protoman.EquiparUpgrade(upgrade);
            botAtacado.Atacar(protoman);
            Assert.AreEqual(99, protoman.Vida);
        }
        [TestMethod]
        public void ProtomanMorreDaRespawnEAumentaAtaqueComUpgrade()
        {
            Protoman protoman = new Protoman();
            Bot bot = new Bot();
            for (int i = 0; i < 34; i++)
            {
                bot.Atacar(protoman);
            }
            UpgradeAtaque upgrade = new UpgradeAtaque();
            protoman.EquiparUpgrade(upgrade);
            protoman.Atacar(bot);
            Assert.AreEqual(91, bot.Vida);
        }
    }
}
