using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class UpgradeLendario : IUpgrade
    {
        public int Ataque
        {
            get
            {
                return 1;
            }
        }

        public int Defesa
        {
            get
            {
                return 1;
            }
        }
    }
}
