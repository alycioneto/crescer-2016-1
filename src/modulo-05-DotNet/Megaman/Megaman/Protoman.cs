using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
	public class Protoman : Robo
	{
		public Protoman() : base()
		{
		}
		protected override int Ataque
		{
			get
			{
				if (VezesMorto == 0)
				{
					return 5;
				}
				else
				{
					return 7;
				}
			}
		}
		protected int VezesMorto { get; set; }
		protected override int Defesa
		{
			get
			{
				return 2;
			}
		}
		public void Respawn()
		{
			if (VezesMorto == 0)
			{
				if (Vida <= 0)
				{
					VezesMorto++;
					Vida = 20;
				}
			}
        }
		public override void ReceberAtaque(int ataque)
		{	
			int dano = ataque - this.Defesa;
			this.Vida -= dano;
			Respawn();
		}
	}
}
