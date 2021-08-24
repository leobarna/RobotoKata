import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotoTest {
    @Test
        void ifYouSaluteRobotoSaluteBack (){
        SaluteRoboto salute = new SaluteRoboto();
        String answer = salute.answer("Hola Roboto");
assertThat(answer,equalTo("Hola gente"));
    }

    @Test
    void ifYouAskWeatherRobotoNoWeather (){
        SaluteRoboto askweather = new SaluteRoboto();
        String noweather = askweather.noweather("¿Que tiempo hace en Barcelona?");
        assertThat(noweather,equalTo("Te vas a Barcelona y miras"));
    }
    @Test
    void ifYouSayNameRobotoPolite (){
        SaluteRoboto sayname = new SaluteRoboto();
        String polite = sayname.polite("me llamo Luisa");
        assertThat(polite,equalTo("encantada de conocerme, Luisa"));
    }
    @Test
    void ifYouAskWhichIsBetterRobotoHasaFavourite (){
        SaluteRoboto askwhichisbetter = new SaluteRoboto();
        String hasafavourite = askwhichisbetter.hasafavourite("¿Qué es mejor, Mac o Linux?");
        assertThat(hasafavourite,equalTo("Sin duda Mac es mejor que Linux"));
    }
    @Test
    void ifYouAskMathRobotoDoesMath (){
        SaluteRoboto askmath = new SaluteRoboto();
        String doesmath = askmath.doesmath("¿Cuánto es 2+2?");
        assertThat(doesmath,equalTo("4"));
    }
}

