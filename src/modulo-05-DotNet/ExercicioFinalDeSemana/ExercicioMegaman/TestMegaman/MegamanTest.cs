﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace TestMegaman
{
    [TestClass]
    public class MegamanTest
    {
        [TestMethod]
        public void MegamanAtacaRoboERoboLevaSeisDeDano()
        {
            Robo robo = new Robo();
            Megaman megaman = new Megaman();
            megaman.Atacar(robo);
            Assert.AreEqual(94, robo.Vida);
        }
        [TestMethod]
        public void MegamanAtacadoPorOutroMegaman()
        {
            Megaman megamanAtacando = new Megaman();
            Megaman megamanLevaDano = new Megaman();
            megamanAtacando.Atacar(megamanLevaDano);
            Assert.AreEqual(94, megamanLevaDano.Vida);
        }
        [TestMethod]
        public void MegamanAtacadoPorBot()
        {
            Megaman megaman = new Megaman();
            Bot bot = new Bot();
            bot.Atacar(megaman);
            Assert.AreEqual(95, megaman.Vida);
        }
        [TestMethod]
        public void MegamanComTrintaDeVidaAtacaMaisForte()
        {
            Megaman megaman = new Megaman();
            Bot bot = new Bot();
            for (int i = 0; i < 14; i++)
            {
                bot.Atacar(megaman);
            }
            megaman.Atacar(bot);
            Assert.AreEqual(30, megaman.Vida);
            Assert.AreEqual(91, bot.Vida);
        }
        [TestMethod]
        public void ToStringMegaman()
        {
            Megaman megaman = new Megaman();
            String Recebido = megaman.ToString();
            String Esperado = "Nome: Megaman, Vida: 100, Ataque: 6, Defesa: 0";
            Assert.AreEqual(Esperado, Recebido);
        }
        [TestMethod]
        public void MegamanComUmUpgradeAtaque()
        {
            Megaman megaman = new Megaman();
            Bot botAtacado = new Bot();
            UpgradeAtaque upgrade = new UpgradeAtaque();
            megaman.EquiparUpgrade(upgrade);
            megaman.Atacar(botAtacado);
            Assert.AreEqual(92, botAtacado.Vida);
        }
        [TestMethod]
        public void MegamanComUmUpgradeDefesa()
        {
            Megaman megaman = new Megaman();
            Bot botAtacado = new Bot();
            UpgradeDefesa upgrade = new UpgradeDefesa();
            megaman.EquiparUpgrade(upgrade);
            botAtacado.Atacar(megaman);
            Assert.AreEqual(97, megaman.Vida);
        }
        [TestMethod]
        public void MegamanComUmUpgradeLendario()
        {
            Megaman megaman = new Megaman();
            Bot botSemUpgrade = new Bot();
            UpgradeLendario upgrade = new UpgradeLendario();
            megaman.EquiparUpgrade(upgrade);
            megaman.Atacar(botSemUpgrade);
            botSemUpgrade.Atacar(megaman);
            Assert.AreEqual(93, botSemUpgrade.Vida);
            Assert.AreEqual(96, megaman.Vida);
        }
        [TestMethod]
        public void MegamanComTrintaDeVidaEUpgradeDeAtaque()
        {
            Megaman megaman = new Megaman();
            Bot bot = new Bot();
            for (int i = 0; i < 14; i++)
            {
                bot.Atacar(megaman);
            }
            UpgradeAtaque upgrade = new UpgradeAtaque();
            megaman.EquiparUpgrade(upgrade);
            megaman.Atacar(bot);
            Assert.AreEqual(89, bot.Vida);
        }
        [TestMethod]
        public void MegamanLevaMenosDanoComValorNegativo()
        {
            Megaman megaman = new Megaman();
            Bot bot = new Bot();
            UpgradeDefesa upgrade = new UpgradeDefesa();
            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade);
            megaman.EquiparUpgrade(upgrade);
            bot.Atacar(megaman);
            Assert.AreEqual(100, megaman.Vida);
        }
    }
}
