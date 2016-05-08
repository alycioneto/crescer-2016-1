using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class UpgradeDefesa : IUpgrade
    {
        public String Nome { get; set; }

        public int Ataque
        {
            get
            {
                return 0;
            }
        }
        public int Defesa
        {
            get
            {
                return 2;
            }
        }

        public UpgradeDefesa()
        {
            this.Nome = "Escudo de Energia";
        }

    }
}
