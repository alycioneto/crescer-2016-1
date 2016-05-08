using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class BotTest
    {
        [TestMethod]
        public void BotNasceComCemDeVida()
        {
            Bot bot = new Bot();
            Assert.AreEqual(100, bot.Vida);
        }
        [TestMethod]
        public void BotAtacadoUmaVezPerdeVidaCincoDeVida()
        {
            Bot botLevaDano = new Bot();
            Bot botAtaca = new Bot();
            botAtaca.Atacar(botLevaDano);
            Assert.AreEqual(95, botLevaDano.Vida);
        }
        [TestMethod]
        public void BotAtacadoCincoVezesPerdeVinteCincoDeVida()
        {
            Bot botLevaDano = new Bot();
            Bot botAtaca = new Bot();
            for (int i = 0; i < 5; i++)
            {
                botAtaca.Atacar(botLevaDano);
            }
            Assert.AreEqual(75, botLevaDano.Vida);
        }
        [TestMethod]
        public void ToStringBot()
        {
            Bot bot = new Bot();
            String Recebido = bot.ToString();
            String Esperado = "Nome: Bot, Vida: 100, Ataque: 5, Defesa: 0";
            Assert.AreEqual(Esperado, Recebido);
        }
        [TestMethod]
        public void BotComUmUpgradeAtaque()
        {
            Bot botAtaca = new Bot();
            Bot botAtacado = new Bot();
            UpgradeAtaque upgrade = new UpgradeAtaque();
            botAtaca.EquiparUpgrade(upgrade);
            botAtaca.Atacar(botAtacado);
            Assert.AreEqual(93 , botAtacado.Vida);           
        }
        [TestMethod]
        public void BotComUmUpgradeDefesa()
        {
            Bot botAtaca = new Bot();
            Bot botAtacado = new Bot();
            UpgradeDefesa upgrade = new UpgradeDefesa();
            botAtacado.EquiparUpgrade(upgrade);
            botAtaca.Atacar(botAtacado);
            Assert.AreEqual(97, botAtacado.Vida);
        }
        [TestMethod]
        public void BotComUmUpgradeLendario()
        {
            Bot botUpgradeLendario = new Bot();
            Bot botSemUpgrade = new Bot();
            UpgradeLendario upgrade = new UpgradeLendario();
            botUpgradeLendario.EquiparUpgrade(upgrade);
            botUpgradeLendario.Atacar(botSemUpgrade);
            botSemUpgrade.Atacar(botUpgradeLendario);
            Assert.AreEqual(94, botSemUpgrade.Vida);
            Assert.AreEqual(96, botUpgradeLendario.Vida);
        }
        [TestMethod]
        public void BotComUmUpgradeDeCada()
        {
            Bot chefao = new Bot();
            Bot fraco = new Bot();
            UpgradeAtaque upgradeAtaque = new UpgradeAtaque();
            UpgradeDefesa upgradeDefesa = new UpgradeDefesa();
            UpgradeLendario upgradeLendario = new UpgradeLendario();
            chefao.EquiparUpgrade(upgradeAtaque);
            chefao.EquiparUpgrade(upgradeDefesa);
            chefao.EquiparUpgrade(upgradeLendario);
            chefao.Atacar(fraco);
            fraco.Atacar(chefao);
            Assert.AreEqual(98 , chefao.Vida);
            Assert.AreEqual(92 , fraco.Vida);
        }
        [TestMethod]
        public void BotTentaFicaOverPower()
        {
            Bot botLadrao = new Bot();
            Bot bot = new Bot();
            UpgradeAtaque upgradeAtaque = new UpgradeAtaque();
            UpgradeDefesa upgradeDefesa = new UpgradeDefesa();
            UpgradeLendario upgradeLendario = new UpgradeLendario();
            botLadrao.EquiparUpgrade(upgradeLendario);
            botLadrao.EquiparUpgrade(upgradeAtaque);
            botLadrao.EquiparUpgrade(upgradeDefesa);
            botLadrao.EquiparUpgrade(upgradeAtaque);
            botLadrao.Atacar(bot);
            bot.Atacar(botLadrao);
            Assert.AreEqual(98, botLadrao.Vida);
            Assert.AreEqual(92, bot.Vida);
        }


    }
}
