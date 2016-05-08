using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioMegaman
{
    public class Protoman : Robo
    {
        public Protoman() : base()
        {
        }
        
        private int VezesMorto { get; set; }
        private int _defesa = 2;
        private int _ataque = 5;
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
        public void VerificaSeMorreu()
        {
            if (VezesMorto == 0 && Vida <= 0)
            {
                    VezesMorto++;
                    _ataque += 2;
                    Vida = 20;
            }
        }
        public override void ReceberAtaque(int ataque)
        {
            int dano = ataque - this.DefesaRobo;
            if (dano > 0)
            {
                this.Vida -= dano;
                VerificaSeMorreu();
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