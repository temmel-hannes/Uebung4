package EventKalender;

import java.util.ArrayList;


public class Eventkalender {

        private ArrayList<Event> events = new ArrayList<>();

        public void add(Event event){
            events.add(event);
        }

        public Event getByTitle(String title) {
            for (Event e : events) {
                if (e.getTitle().equals(title)) {
                    return e;
                }
            }
            return null;
        }

        public ArrayList<Event> getByOrt(String ort) {
            ArrayList<Event> found = new ArrayList<>();
            for (Event e : events) {
                if (e.getOrt().equals(ort)) {
                    found.add(e);
                }
            }
            return found;
        }

        public ArrayList<Event> getByPreis(double min, double max){
            ArrayList<Event> found = new ArrayList<>();
            for (Event e : events) {
                if (e.getPreis() >= min && e.getPreis() <= max) {
                    found.add(e);
                }
            }
            return found;
        }

        public Event getMostExpensiveByOrt(String Ort){
            double max = 0.0;
            Event mostexpensive = null;
            for (Event e : events){
                if(e.getOrt().equals(Ort)){
                    if(e.getPreis() > max){
                        max = e.getPreis();
                        mostexpensive = e;
                    }
                }
            }
            return mostexpensive;
        }

        public double getAvgPreisByOrt(String Ort){
            double sum = 0;
            int cnt = 0;
            for (Event e: events){
                if(e.getOrt().equals(Ort)){
                    sum += e.getPreis();
                    cnt++;
                }
            }
            return sum/cnt;
        }
}
