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

        public int Vida { get; protected set; }
        protected int _ataque= 5;
        protected virtual int Ataque
        {
            get
            {
                return _ataque;
            }
        }
        protected int _defesa = 0;
        protected virtual int Defesa
        {
            get
            {
                return _defesa;
            }
        }

        public virtual void Atacar(Robo robo)
        {
            robo.ReceberAtaque(this.Ataque);
        }

        public virtual void ReceberAtaque(int ataque)
        {
            int dano = ataque - this.Defesa;
            this.Vida -= dano;
        }
        public override string ToString()
        {
            return ("Nome: " + this.GetType().Name + ", Vida: " + Vida + ", Ataque: " + Ataque + ", Defesa: " + Defesa);
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
