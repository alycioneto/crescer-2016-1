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

        protected int VezesMorto { get; set; }
        protected int _defesa = 2;
        protected override int Defesa
        {
            get
            {
                return _defesa;
            }
        }
        public void Respawn()
        {
            if (VezesMorto == 0)
            {
                if (Vida <= 0)
                {
                    VezesMorto++;
                    _ataque = 7;
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
        public override void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrades.Count() < 3)
            {
                Upgrades.Add(upgrade);
                if (upgrade.GetType().Name == "UpgradeDefesa")
                {
                    _defesa += upgrade.Defesa;
                }
                else if (upgrade.GetType().Name == "UpgradeAtaque")
                {
                    _ataque += upgrade.Ataque;
                }
                else
                {
                    _defesa += upgrade.Defesa;
                    _ataque += upgrade.Ataque;
                }
            }
        }
    }
}