using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class UpgradeLendarioTest
    {
        [TestMethod]
        public void UpgradeCriadoComUmDeDefesa()
        {
            UpgradeLendario upgrade = new UpgradeLendario();
            Assert.AreEqual(1, upgrade.Defesa);
        }
        [TestMethod]
        public void UpgradeCriadoComUmDeAtaque()
        {
            UpgradeLendario upgrade = new UpgradeLendario();
            Assert.AreEqual(1, upgrade.Ataque);
        }

    }
}
