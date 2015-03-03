package org.micromanager.data;

/**
 * This class signifies that a Datastore has become locked and cannot be 
 * written to any more (but read actions can still occur).
 */
public interface DatastoreLockedEvent {}