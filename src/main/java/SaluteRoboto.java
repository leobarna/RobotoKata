public class SaluteRoboto {
    public String answer(String hola) {
        if(hola.equals("Hola Roboto")){
            return "Hola gente";
        }
        return "Holi";
    }

    public String noweather(String tiempo) {
        if (tiempo.equals("¿Que tiempo hace en Barcelona?")){
            return "Te vas a Barcelona y miras";
        }
        return "Hola";
    }

    public String polite(String nombre) {
        if (nombre.equals("me llamo Luisa")){
            return "encantada de conocerme, Luisa";
        }
        return "Hey";
    }

    public String hasafavourite(String favorito) {
        if (favorito.equals("¿Qué es mejor, Mac o Linux?")){
            return "Sin duda Mac es mejor que Linux";
        }
        return "Patata";
    }

    public String doesmath(String mates) {
        if(mates.equals("¿Cuánto es 2+2?")){
            return "4";
        }
        return "vacaciones santillana/rubio";
    }
}
