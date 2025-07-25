package com.ani.sound;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출금합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person locarVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
				;
			}
		};
		locarVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
