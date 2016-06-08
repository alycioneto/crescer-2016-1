/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crescer.aula1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alycio
 */
public class MeuCalendarioUtil {
        public String dayOfWeek(Date data){
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(data);
            int numeroDiaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
            String diaDaSemana = null;
            switch(numeroDiaDaSemana){
                case 1:
                    diaDaSemana = "Domingo";
                    break;
                case 2:
                    diaDaSemana = "Segunda";
                    break;
                case 3:
                     diaDaSemana = "Terça";
                     break;
                case 4:
                    diaDaSemana = "Quarta";
                    break;
                case 5:
                    diaDaSemana = "Quinta";
                    break;
                case 6:
                    diaDaSemana = "Sexta";
                    break;
                case 7:
                    diaDaSemana = "Sabado";
                    break;
                default:
                    diaDaSemana = "Data não Existe";
            }
            return diaDaSemana;
        }
}
