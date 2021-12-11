package glacialExpedition.repositories;

import glacialExpedition.models.states.State;

import java.util.*;

public class StateRepository implements Repository<State>{

    Map<String, State> states;


    public StateRepository() {
        this.states = new LinkedHashMap<>();
    }

    @Override
    public Collection<State> getCollection() {
        return Collections.unmodifiableCollection(this.states.values());
    }

    @Override
    public void add(State entity) {
    this.states.put(entity.getName(),entity);
    }

    @Override
    public boolean remove(State entity) {
        return this.states.remove(entity.getName())!=null;
    }

    @Override
    public State byName(String name) {
        return this.states.get(name);
    }
}
