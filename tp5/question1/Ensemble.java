package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

	protected java.util.Vector<T> table = new java.util.Vector<T>();

	public int size() {
		return table.size();
	}

	public Iterator<T> iterator() {
		return table.iterator();
	}

	public boolean add(T t) {
		// à compléter pour la question1-1
		if (table.contains(t)) {
			return false;
		} else {
			table.add(t);
		}
		return true;
	}

	public Ensemble<T> union(Ensemble<? extends T> e) {
		// à compléter pour la question1-2
		Ensemble<T> ensunion = new Ensemble<T>();

		ensunion.addAll(e);
		ensunion.addAll(table);

		return ensunion;
	}

	public Ensemble<T> inter(Ensemble<? extends T> e) {
		// à compléter pour la question1-2
		Ensemble<T> ensinter = new Ensemble<T>();

		ensinter.addAll(table);
		ensinter.retainAll(e);
		return ensinter;
	}

	public Ensemble<T> diff(Ensemble<? extends T> e) {
		// à compléter pour la question1-2
		Ensemble<T> ensdiff = new Ensemble<T>();

		ensdiff.addAll(table);
		ensdiff.removeAll(e);
		return ensdiff;
	}

	public Ensemble<T> diffSym(Ensemble<? extends T> e) {
		// à compléter pour la question1-2
		Ensemble<T> ensdiff1 = new Ensemble<T>();
		Ensemble<T> ensdiff2 = new Ensemble<T>();
		Ensemble<T> ensdiffsym = new Ensemble<T>();

		ensdiff1.addAll(table);
		ensdiff1.removeAll(e);

		ensdiff2.addAll(e);
		ensdiff2.removeAll(table);

		return ensdiff1.union(ensdiff2);
	}
	
}
