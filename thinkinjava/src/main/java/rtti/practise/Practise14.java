package rtti.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part{

    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Class<? extends Part>> partFactories = new ArrayList<Class<? extends Part>>();

    static{
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }

    private static Random rand = new Random(47);
    public static Part createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).newInstance();
    }

}

class Filter extends Part{}

class FuelFilter extends Filter{

}

class AirFilter extends Filter{

}

class CabinAirFilter extends Filter{

}

class OilFilter extends Filter {

}


class Belt extends Part{

}

class FanBelt extends Belt{

}


class GeneratorBelt extends Belt{

}

class PowerSteeringBelt extends Belt{

}

public class Practise14 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
