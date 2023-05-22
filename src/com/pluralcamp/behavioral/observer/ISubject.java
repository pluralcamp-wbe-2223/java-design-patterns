package com.pluralcamp.behavioral.observer;

public interface ISubject {
	void register(Observer anObserver);

	void unregister(Observer anObserver);

	void notifyRegisteredUsers(int notifiedValue);
}
