package com.company.designpatterns.iterator;

public class Task implements Container {

    private String[] tasks = {"Build house", "Born son", "Grow tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
