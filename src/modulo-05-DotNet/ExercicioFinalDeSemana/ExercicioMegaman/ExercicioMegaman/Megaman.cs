using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class Megaman : Robo
    {
        public Megaman() : base()
        {
        }
        protected new int _ataque =6;
        protected override int Ataque
        {
            get
            {
                return _ataque;
            }
        }
        public override void Atacar(Robo robo)
        {
            if (this.Vida <= 30)
            {
                robo.ReceberAtaque(this.Ataque + 3);
            }
            else
            {
                robo.ReceberAtaque(this.Ataque);
            }
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
