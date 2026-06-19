class TimeMap {

    private Map<String, TreeMap<Integer, String>> hashMap; 

    public TimeMap() {
        hashMap = new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {

        hashMap.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!hashMap.containsKey(key)) return "";
        TreeMap<Integer, String> timestamps = hashMap.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue(); 
        
    }
}
