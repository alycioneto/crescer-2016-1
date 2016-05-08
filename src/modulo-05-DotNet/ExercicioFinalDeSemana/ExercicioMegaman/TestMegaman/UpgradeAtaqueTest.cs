using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;
namespace TestMegaman
{
    [TestClass]
    public class UpgradeAtaqueTest
    {
        [TestMethod]
        public void UpgradeCriadoComDoisDeAtaque()
        {
            UpgradeAtaque upgrade = new UpgradeAtaque();
            Assert.AreEqual(2 , upgrade.Ataque);
        }
        [TestMethod]
        public void UpgradeCriadoComZeroDeDefesa()
        {
            UpgradeAtaque upgrade = new UpgradeAtaque();
            Assert.AreEqual(0, upgrade.Defesa);
        }

    }
}
