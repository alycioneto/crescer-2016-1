using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class UpgradeAtaque : IUpgrade
    {
        public String Nome { get; set; }

        public int Ataque
        {
            get
            {
                return 2;
            }
        }
        public int Defesa
        {
            get
            {
                return 0;
            }
        }

        public UpgradeAtaque()
        {
            this.Nome = "Canhão de Plasma";
        }
    }
}
