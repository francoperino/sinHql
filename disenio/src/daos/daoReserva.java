package daos;

import java.util.ArrayList;

import Entidades.Aula;
import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;
import Entidades.Curso;
import Entidades.Diareserva;
import Entidades.Docente;
import Entidades.Reserva;
import Entidades.Usuario;

public class daoReserva {

	public void registrarReserva(Reserva reserva,Boolean ban) throws Exception {
		Conexion.ejecutarSentencia("insert into reserva(nickusuario,cantalumnos,tipoaula,codcurso,idciclolectivo,iddocente)"+"values('"+reserva.getUsuario().getNickusuario()+"','"+reserva.getCantalumnos()+"','"+reserva.getTipoaula()+"','"+reserva.getCurso().getCodigocurso()+"','"+reserva.getCiclolectivo().getIdciclolectivo()+"','"+reserva.getDocente().getIddocente()+"');");
		String consulta = "select MAX(r.idreserva) AS maxid from reserva r ";
        ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
		if(ban==true) {
			Conexion.ejecutarSentencia("insert into esporadica(idreserva)"+"values('"+res.get(0).getValor("maxid")+"');");	
			
		}
		else{
			Conexion.ejecutarSentencia("insert into periodica(idreserva,tipoperiodo)"+"values('"+res.get(0).getValor("maxid")+"','"+reserva.getPeriodica().getTipoperiodo()+"');");	
			
		}
		
		for(int i=0;i<reserva.getDiareservas().size();i++) {
			Conexion.ejecutarSentencia("insert into diareserva(idreserva,diacalendario,horainicio,duracion,numeroaula)"+"values('"+res.get(0).getValor("maxid")+"','"+reserva.getDiareservas().get(i).getDiacalendario()+"','"+reserva.getDiareservas().get(i).getHorainicio()+"','"+reserva.getDiareservas().get(i).getDuracion()+"','"+reserva.getDiareservas().get(i).getAula().getNumero()+"');");
			
		}
			
		
		
		
	}

}
