using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class Rush : Robo, IUpgrade
    {
        public String Nome { get; set; }
        private int _ataque = 4;
        private int _defesa = 3;
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

        public int Ataque
        {
            get
            {
                return _ataque;
            }
        }

        public int Defesa
        {
            get
            {
                return _defesa;
            }
        }

        public override void EquiparUpgrade(IUpgrade upgrade)
        {
            if (Upgrades.Count() < 2)
            {
                Upgrades.Add(upgrade);            
                _defesa += upgrade.Defesa;
                _ataque += upgrade.Ataque;
            }
        }

    }
}
