import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

public class ZonedDT {
    public static void scheduleReport(LocalDateTime checkOut, ZoneId checkOutZone, LocalDateTime checkIn, ZoneId checkInZone) {
        ZonedDateTime beginTrip = ZonedDateTime.of(checkOut, checkOutZone);
        System.out.println("Trip begins: " + beginTrip);
        ZoneRules checkOutZoneRules = checkOutZone.getRules();
        System.out.println("Checkout Time zone rules: " + checkOutZoneRules);
        ZonedDateTime beginPlus = beginTrip.plusDays(4);
        System.out.println("Four days later: " + beginPlus);
        ZonedDateTime endTripOriginalZone = ZonedDateTime.of(checkIn, checkInZone);
        ZonedDateTime endTrip = ZonedDateTime.of(checkIn, checkInZone);
        int diff = endTripOriginalZone.compareTo(endTrip);
        String diffStr = (diff >= 0) ? "NO":"YES";
        System.out.println("End trip date/time in original zone: " + endTripOriginalZone);
        System.out.println("Original Zone Time is less than new zone time? " + diffStr);
        ZoneId checkOutZoneId = beginTrip.getZone();
        ZoneOffset checkOutOffset = beginTrip.getOffset();
        ZoneId checkInZoneID = endTrip.getZone();
        ZoneOffset checkInOffset = endTrip.getOffset();
        System.out.println("Check out zone and offset: " + checkOutZoneId + checkOutOffset);
        System.out.println("Check in zone and offset: " + checkInZoneID + checkInOffset);
    }



}
