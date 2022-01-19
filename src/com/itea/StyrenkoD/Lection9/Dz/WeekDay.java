package com.itea.StyrenkoD.Lection9.Dz;

public enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    private boolean holiday;

    WeekDay() {
        switch (this.name()) {
            case "SATURDAY" -> this.setHoliday(true);
            case "SUNDAY" -> this.setHoliday(true);
            default -> this.setHoliday(false);
        }
    }

    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;

    }

    public boolean isWeekDay() {
        return !holiday;
    }

    @Override
    public String toString() {
        return String.format("%10s is %12s", this.name(), (this.isWeekDay() ? "working day" : "holiday"));
    }
}
