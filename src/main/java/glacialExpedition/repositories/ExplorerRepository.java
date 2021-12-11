package glacialExpedition.repositories;

import glacialExpedition.models.explorers.Explorer;

import java.util.*;
import java.util.stream.Collectors;

public class ExplorerRepository implements Repository<Explorer> {
   Map<String,Explorer> explorerMap;

    public ExplorerRepository() {
        this.explorerMap = new LinkedHashMap<>();
    }

    @Override
    public Collection<Explorer> getCollection() {
        return Collections.unmodifiableCollection(this.explorerMap.values());
    }

    @Override
    public void add(Explorer explorer) {
        explorerMap.put(explorer.getName(),explorer);

    }

    @Override
    public boolean remove(Explorer entity) {
      return  explorerMap.remove(entity.getName()) !=null;
    }

    @Override
    public Explorer byName(String name) {
        return explorerMap.get(name);
    }
}
