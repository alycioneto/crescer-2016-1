using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class UpgradeDefesaTest
    {
        [TestMethod]
        public void UpgradeCriadoComDoisDeDefesa()
        {
            UpgradeDefesa upgrade = new UpgradeDefesa();
            Assert.AreEqual(2, upgrade.Defesa);
        }
        [TestMethod]
        public void UpgradeCriadoComZeroDeAtaque()
        {
            UpgradeDefesa upgrade = new UpgradeDefesa();
            Assert.AreEqual(0, upgrade.Ataque);
        }
        [TestMethod]
        public void UpgradeCriadoComNomeCorreto()
        {
            UpgradeDefesa upgrade = new UpgradeDefesa();
            String esperado = "Escudo de Energia";
            Assert.AreEqual(esperado, upgrade.Nome);
        }

    }
}
