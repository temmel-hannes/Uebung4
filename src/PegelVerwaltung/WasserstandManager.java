package PegelVerwaltung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WasserstandManager {
    private ArrayList<Wasserstand> list = new ArrayList<>();

    public void add(Wasserstand wasser){
        list.add(wasser);
    }

    public Wasserstand findById(int id){
        for (Wasserstand w : list){
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();

        for (Wasserstand w : list){
            if (w.getGewaesserName().equals(gewaesserName)){
                found.add(w);
            }
        }
        return found;
    }

    public ArrayList<Wasserstand> findByWasserstandForGewaesser(String gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();

        for (Wasserstand w : list){
            if(w.getGewaesserName().equals(gewaesserName)){
                found.add(w);
            }
        }
        return found;
    }

    public Wasserstand findNewestWasserstandForGewaesser(String gewaesserName){
        int sek = 0;
        Wasserstand neu = null;

        for (Wasserstand w : list){
            if (w.getGewaesserName().equals(gewaesserName)){
                if (w.getZeitpunkt() > sek){
                    sek = w.getZeitpunkt();
                    neu = w;
                }
            }

        }
        return neu;
    }

    public Wasserstand findOldestWasserstandForGewaesser(String gewaesserName){
        int sek = Integer.MAX_VALUE;
        Wasserstand neu = null;

        for (Wasserstand w : list){
            if (w.getGewaesserName().equals(gewaesserName)){
                if (w.getZeitpunkt() < sek){
                    sek = w.getZeitpunkt();
                    neu = w;
                }
            }

        }
        return neu;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> found = new ArrayList<>();

        for (Wasserstand w : list){
            if (w.getMessWert() >= w.getMessWertFürAlamierung()){
                found.add(w);
            }
        }
        return found;
    }

    public ArrayList<Wasserstand> findByZeitspanne(int von, int bis, String gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();

        for (Wasserstand w : list){
            if (w.getGewaesserName().equals(gewaesserName)){
                if (w.getZeitpunkt() >= von && w.getZeitpunkt() <= bis){
                    found.add(w);
                }
            }
        }
        return found;
    }

    public HashMap<String, ArrayList<Wasserstand>> getAllWasserstaendePerGewaesser() {
        HashMap<String, ArrayList<Wasserstand>> resultMap = new HashMap<>();
        for (Wasserstand w : list){
            if (resultMap.containsKey(w.getGewaesserName())){
                ArrayList<Wasserstand> list = resultMap.get(w.getGewaesserName());
                list.add(w);
                resultMap.put(w.getGewaesserName(), list);
            }
            else{
                ArrayList<Wasserstand> list = new ArrayList<>();
                list.add(w);
                resultMap.put(w.getGewaesserName(),list);
            }
        }
        return resultMap;
    }

    public HashMap<Integer, ArrayList<Wasserstand>> getAllWasserstaendePerZeitpunkt(){
        HashMap<Integer, ArrayList<Wasserstand>> resultMap = new HashMap<>();

        for (Wasserstand w : list){
            ArrayList<Wasserstand> wassstaende;
            if (resultMap.containsKey(w.getZeitpunkt())){
                wassstaende = resultMap.get(w.getZeitpunkt());
            }
            else{
                wassstaende = new ArrayList<>();
            }
            wassstaende.add(w);
            resultMap.put(w.getZeitpunkt(),wassstaende);
        }
        return resultMap;
    }

    public HashMap<String, Integer> getNumberOfAlarmsPerGewaesser (){
        HashMap<String, Integer> resultMap = new HashMap<>();

        for (Wasserstand w : list){
            if (resultMap.containsKey(w.getGewaesserName())){

                resultMap.put(w.getGewaesserName(), resultMap.get(w.getGewaesserName()+1));
            }
            else{
                resultMap.put(w.getGewaesserName(),1);
            }
        }
        return resultMap;
    }

}
