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
        private int _ataque =6;
        private int _defesa = 0;
        protected override int AtaqueRobo
        {
            get
            {
                return _ataque;
            }
        }
        protected override int DefesaRobo
        {
            get
            {
                return _defesa;
            }
        }
        public override void Atacar(Robo robo)
        {
            if (this.Vida <= 30)
            {
                robo.ReceberAtaque(this.AtaqueRobo + 3);
            }
            else
            {
                robo.ReceberAtaque(this.AtaqueRobo);
            }
        }
        public override void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrades.Count() < 3)
            {
                Upgrades.Add(upgrade);
               _defesa += upgrade.Defesa;
               _ataque += upgrade.Ataque;
                
            }
        }
    }
}
