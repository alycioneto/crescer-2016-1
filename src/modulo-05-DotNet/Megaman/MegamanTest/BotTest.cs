using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExercicioMegaman;

namespace MegamanTest
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
		public void BotAtacadoCincoVezesPerdeVinteCincoDeVida() {
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

	}
}
