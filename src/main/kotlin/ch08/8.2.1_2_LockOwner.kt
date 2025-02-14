package ch08

import java.util.concurrent.locks.Lock

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }

    fun __runUnderLock__(body: () -> Unit) {
        lock.lock()
        try {
            body()
        } finally {
            lock.unlock()
        }
    }
}