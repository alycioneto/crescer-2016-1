using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public interface IUpgrade
    {
        String Nome { get; set; }
        int Ataque { get; }
        int Defesa { get; }
    }
}
