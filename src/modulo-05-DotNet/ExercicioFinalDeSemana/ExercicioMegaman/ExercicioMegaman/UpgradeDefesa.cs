using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class UpgradeDefesa : IUpgrade
    {
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


    }
}
