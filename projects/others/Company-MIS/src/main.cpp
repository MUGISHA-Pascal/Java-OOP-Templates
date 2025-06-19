#include "utils/member_management.h"
#include <iostream>
#include "utils/include/member.hpp"

int main() {
    int choice;
    Member member;

    while (true) {
        std::cout << "\n1. Add new member\n";
        std::cout << "2. Display All members\n";
        std::cout << "3. Update Member\n";
        std::cout << "4. Delete Member\n";
        std::cout << "5. Exit\n";
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case 1:
                std::cout << "Enter ID: ";
                std::cin >> member.id;
                std::cout << "Enter Name: ";
                std::cin.ignore();
                std::getline(std::cin, member.name);
                std::cout << "Enter Phone: ";
                std::cin >> member.phone;
                std::cout << "Enter Motorcycle: ";
                std::cin.ignore();
                std::getline(std::cin, member.motorcycle);
                std::cout << "Enter Date (joined): ";
                std::getline(std::cin, member.date_joined);
                addMember(member);
                break;
            case 2:
                displayAllMembers();
                break;
            case 3:
                int idToUpdate;
                std::cout << "Enter ID to update: ";
                std::cin >> idToUpdate;
                std::cout << "Enter new Name: ";
                std::cin.ignore();
                std::getline(std::cin, member.name);
                std::cout << "Enter new Phone: ";
                std::cin >> member.phone;
                std::cout << "Enter new Motorcycle: ";
                std::cin.ignore();
                std::getline(std::cin, member.motorcycle);
                std::cout << "Enter new Date (joined): ";
                std::getline(std::cin, member.date_joined);
                updateMember(idToUpdate, member);
                break;
            case 4:
                int idToDelete;
                std::cout << "Enter ID to delete: ";
                std::cin >> idToDelete;
                deleteMember(idToDelete);
                break;
            case 5:
                return 0;
            default:
                std::cout << "Invalid choice. Please try again.\n";
        }
    }

    return 0;
}
