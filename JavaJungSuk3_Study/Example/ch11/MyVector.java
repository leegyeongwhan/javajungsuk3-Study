package JavaJungSuk3_Study.Example.ch11;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyVector implements List {
  int size = 0;
  int capacity = 0;
  Object[] data = null;

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    return false;
  }

  @Override
  public void replaceAll(UnaryOperator operator) {
    List.super.replaceAll(operator);
  }

  @Override
  public void sort(Comparator c) {
    List.super.sort(c);
  }

  @Override
  public void clear() {

  }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public Object set(int index, Object element) {
    return null;
  }

  @Override
  public void add(int index, Object element) {

  }

  @Override
  public Object remove(int index) {
    Object oldobj = null;

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("범위를 벗어났습니다");
    }
    oldobj = data[index];
//    if (index != size - 1) {
//      System.arraycopy(data, index + 1, data, index), size - index - 1;
//    }

    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator listIterator() {
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    return null;
  }

  @Override
  public Spliterator spliterator() {
    return List.super.spliterator();
  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    return false;
  }

  @Override
  public Object[] toArray(Object[] a) {
    return new Object[0];
  }
}
