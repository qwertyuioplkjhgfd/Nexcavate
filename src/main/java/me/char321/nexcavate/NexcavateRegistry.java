package me.char321.nexcavate;

import me.char321.nexcavate.items.stations.ResearchStation;
import me.char321.nexcavate.research.Research;
import me.char321.nexcavate.slimefun.NEAssembly;
import me.char321.nexcavate.structure.Structure;
import org.bukkit.NamespacedKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NexcavateRegistry {
    private final Map<Integer, ResearchStation> researchStations = new HashMap<>();
    private final Map<NamespacedKey, Research> researchMap = new HashMap<>();
    private final List<Research> researches = new ArrayList<>();

    private final Map<Structure, NEAssembly> assemblies = new HashMap<>();

    public Map<Integer, ResearchStation> getResearchStations() {
        return researchStations;
    }

    public ResearchStation getResearchStation(int tier) {
        return researchStations.get(tier);
    }

    public List<Research> getResearches() {
        return researches;
    }

    public Research getResearch(NamespacedKey key) {
        return researchMap.get(key);
    }

    public Map<NamespacedKey, Research> getResearchMap() {
        return researchMap;
    }

    public Map<Structure, NEAssembly> getAssemblies() {
        return assemblies;
    }
}
