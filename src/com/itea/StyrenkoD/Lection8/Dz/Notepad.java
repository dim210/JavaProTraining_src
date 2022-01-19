package com.itea.StyrenkoD.Lection8.Dz;


public class Notepad {
    private final int DAYSINYEAR = 366;
    private RecDay[] recDays = new RecDay[DAYSINYEAR];

    public void addRecord(int dayOfYear, int hour, String rec) {
        if (dayOfYear > DAYSINYEAR - 1) {
            System.out.println("dayOfYear must be between 0.." + (DAYSINYEAR - 1));
        } else {
            if (this.recDays[dayOfYear] == null) {
                this.recDays[dayOfYear] = new RecDay();
            }
            this.recDays[dayOfYear].addRecord(hour, rec);
        }
    }

    @Override
    public String toString() {
        String allDays = "";
        for (int i = 0; i < this.recDays.length; i++) {
            if (this.recDays[i] != null) {
                allDays = allDays + "-- day " + i + " --\n" + this.recDays[i] + "\n";
            }
        }
        return allDays;
    }

    private class RecDay {
        private final int hoursCount = 24;
        private Record[] recs = new Record[hoursCount];

        public void addRecord(int hour, String rec) {
            if (hour > hoursCount - 1) {
                System.out.println("hour must be between 0..23");
            } else {
                if (this.recs[hour] == null){
                    this.recs[hour] = new Record();
                }
                this.recs[hour].setRec(rec);
            }
        }

        @Override
        public String toString() {
            String allRecs = "";
            for (int i = 0; i < this.recs.length; i++) {
                if (this.recs[i] != null) {
                    allRecs = allRecs + i + ": '" + this.recs[i] + "'\n";
                }
            }
            return allRecs;
        }

        private class Record {
            private String rec;

            public String getRec() {
                return rec;
            }

            public void setRec(String rec) {
                this.rec = rec;
            }

            @Override
            public String toString() {
                return this.getRec();
            }
        }
    }


}
