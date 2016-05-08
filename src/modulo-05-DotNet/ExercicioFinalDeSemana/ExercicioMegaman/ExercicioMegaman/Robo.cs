using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class Robo
    {
        public Robo()
        {
            Vida = 100;
        }
        protected List<IUpgrade> Upgrades = new List<IUpgrade>();

        public int Vida { get; set; }
        private int _ataque= 5;
        protected virtual int AtaqueRobo
        {
            get
            {
                return _ataque;
            }
        }
        private int _defesa = 0;
        protected virtual int DefesaRobo
        {
            get
            {
                return _defesa;
            }
        }

        public virtual void Atacar(Robo robo)
        {
            robo.ReceberAtaque(this.AtaqueRobo);
        }

        public virtual void ReceberAtaque(int ataque)
        {
            int dano = ataque - this.DefesaRobo;
            if (dano > 0)
            {
                this.Vida -= dano;
            }
        }
        public override string ToString()
        {
            return ("Nome: " + this.GetType().Name + ", Vida: " + Vida + ", Ataque: " + AtaqueRobo + ", Defesa: " + DefesaRobo);
        }
        public virtual void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrades.Count() < 3)
            {
                Upgrades.Add(upgrade);
                if (upgrade.GetType().Name == "UpgradeDefesa"){
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
